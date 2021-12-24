package message

case class SetRequest(key: String, value: Any)

case class GetRequest(key: String)

case class KeyNoFoundException(key: String) extends Exception

