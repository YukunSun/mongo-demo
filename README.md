# 技术栈
- SpringBoot-1.5.3.RELEASE
- mongodb-3.3.4



# Questions

1. [该使用MongoTemplate还是MongoRepository?](https://stackoverflow.com/questions/17008947/whats-the-difference-between-spring-datas-mongotemplate-and-mongorepository)




2. [入库时document中含有_class字段？](https://stackoverflow.com/questions/6810488/spring-data-mongodb-mappingmongoconverter-remove-class/)
例如：
```
{
	"_id" : ObjectId("592d1c015d56b70c048560a4"),
	"_class" : "net.coderdaily.bean.Post",
	"title" : "aaa",
	"date" : ISODate("2017-05-30T15:15:13.228+08:00")
}
```
方法：
http://www.mkyong.com/mongodb/spring-data-mongodb-remove-_class-column/


起源：

> So here's the story: we add the type by default as some kind of hint what class to instantiate actually. As you have to pipe in a type to read the document into via MongoTemplate anyway there are two possible options:
> 1. You hand in a type the actual stored type can be assigned to. In that case we consider the stored type, use that for object creation. Classical example here is doing polymorphic queries. Suppose you have an abstract class Contact and your Person. You could then query for Contacts and we essentially have to determine a type to instantiate.
> 2. If you - on the other hand - pass in a completely different type we'd simply marshal into that given type, not into the one stored in the document actually. That would cover your question what happens if you move the type.


3. 字段的唯一性设置。

```
db.post.ensureIndex({"title":1},{"unique":true})
```