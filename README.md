# A Demo Project
take notes my start in akka and my application.conf :)

use the java-serialization and have only two message model;

### SetRequest(key:String,value:Object)  

### GetRequest(key:String)  

oh, I forget,this is a database (maybe not?) base on memory? and it can't support persistence
  
Does it match database name?   

Yes,it doesn't  

ps:   
    1. don't use java-serialization to serialization actor,It's unsafe.  
    2. server and client must both allow the same serialization  
    