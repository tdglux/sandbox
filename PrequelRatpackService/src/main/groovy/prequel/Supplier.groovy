package ratpack.prequel

import com.mongodb.MongoClient
import com.mongodb.DB
import com.mongodb.BasicDBObject

class SupplierService {
  DB db

  SupplierService() {
    //MongoClient mongoCl = new MongoClient('192.168.193.222') // or MongoClient('localhost') or MongoClient('localhost', 27017)      
    //db = mongoCl.getDB('supplier')
  }

  def getDatasheet (name) {
    db.getCollection('datasheet').find(new BasicDBObject('name', name))
  }
}