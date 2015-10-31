import static ratpack.groovy.Groovy.ratpack
import com.mongodb.BasicDBObject
import com.mongodb.BulkWriteOperation
import com.mongodb.BulkWriteResult
import com.mongodb.Cursor
import com.mongodb.DB
import com.mongodb.DBCollection
import com.mongodb.DBCursor
import com.mongodb.DBObject
import com.mongodb.MongoClient
import com.mongodb.ParallelScanOptions
//import ratpack.prequal.SupplierService

//def service = new SupplierService()

ratpack {
  handlers {
    get("supplier") {
      response.contentType("application/json")
      response.send(new groovy.json.JsonBuilder(["ping"]))
      //response.send(new groovy.json.JsonBuilder(service.getDatasheet(request.queryParams.test)).toPrettyString())
    }
    get("ping") {
    	response.send("pong")
    }
  }
}
