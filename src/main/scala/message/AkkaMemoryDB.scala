package message

import akka.actor.{Actor, Status}

import scala.collection.mutable

class AkkaMemoryDB extends Actor {

    val map = new mutable.HashMap[String, Any]

    override def receive: Receive = {
        case SetRequest(key, value) =>
            println(s"received SetRequest:  key => $key  value => $value")
            map.put(key, value)
            sender() ! Status.Success
        case GetRequest(key) =>
            println(s"received GetRequest:  key => $key")
            val res = map.get(key)
            res match {
                case Some(value) => sender() ! value
                case None => sender() ! Status.Failure(KeyNoFoundException(key))
            }
        case x => println(x);Status.Failure(new ClassNotFoundException)
    }
}
