import akka.actor.{ActorSystem, Props}
import com.typesafe.config.ConfigFactory
import message.AkkaMemoryDB

object Main {
    def main(args: Array[String]): Unit = {
        val system = ActorSystem("SimpleAkkaDB",ConfigFactory.load("server"))
        val actor = system.actorOf(Props[AkkaMemoryDB], "AkkaDBActor")
    }
}
