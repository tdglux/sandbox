package service

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
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

@SpringBootApplication
@RestController
class RequestDispatcher {
	@RequestMapping(value = '/', produces = 'application/json')
    String home() {
		MongoClient mongoCl = new MongoClient('localhost'); // or MongoClient('localhost') or MongoClient('localhost', 27017)      
	    DB db = mongoCl.getDB('supplier');

	    return new groovy.json.JsonBuilder(db.getCollection('datasheet').find(new BasicDBObject('name', 'Thai'))).toPrettyString();
    }

    static void main(String[] args) {
        SpringApplication.run(RequestDispatcher, args)
    }
}
