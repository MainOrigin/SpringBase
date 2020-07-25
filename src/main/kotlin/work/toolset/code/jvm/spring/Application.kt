package work.toolset.code.jvm.spring

//import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@org.springframework.boot.autoconfigure.SpringBootApplication(
        exclude = [
            org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration::class,
            org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration::class,
            org.springframework.boot.actuate.autoconfigure.metrics.export.datadog.DatadogMetricsExportAutoConfiguration::class,
            org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration::class,
            org.springframework.boot.autoconfigure.data.jdbc.JdbcRepositoriesAutoConfiguration::class,
            org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration::class,
            org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration::class,
            org.springframework.boot.actuate.autoconfigure.metrics.orm.jpa.HibernateMetricsAutoConfiguration::class,
            org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration::class,
            org.springframework.boot.autoconfigure.data.redis.RedisReactiveAutoConfiguration::class,
            org.springframework.boot.autoconfigure.data.redis.RedisRepositoriesAutoConfiguration::class,
            org.springframework.boot.actuate.autoconfigure.redis.RedisHealthContributorAutoConfiguration::class,
            org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration::class,
            org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration::class,
            org.springframework.boot.autoconfigure.mongo.MongoReactiveAutoConfiguration::class,
            org.springframework.boot.autoconfigure.data.mongo.MongoReactiveDataAutoConfiguration::class,
            org.springframework.boot.autoconfigure.data.mongo.MongoRepositoriesAutoConfiguration::class,
            org.springframework.boot.autoconfigure.data.mongo.MongoReactiveRepositoriesAutoConfiguration::class,
            org.springframework.boot.actuate.autoconfigure.mongo.MongoHealthContributorAutoConfiguration::class,
            org.springframework.boot.autoconfigure.solr.SolrAutoConfiguration::class,
            org.springframework.boot.autoconfigure.data.solr.SolrRepositoriesAutoConfiguration::class,
            org.springframework.boot.actuate.autoconfigure.solr.SolrHealthContributorAutoConfiguration::class,
            org.springframework.boot.autoconfigure.cassandra.CassandraAutoConfiguration::class,
            org.springframework.boot.autoconfigure.data.cassandra.CassandraDataAutoConfiguration::class,
            org.springframework.boot.autoconfigure.data.cassandra.CassandraRepositoriesAutoConfiguration::class,
            org.springframework.boot.autoconfigure.data.cassandra.CassandraReactiveDataAutoConfiguration::class,
            org.springframework.boot.autoconfigure.data.cassandra.CassandraReactiveRepositoriesAutoConfiguration::class,
            org.springframework.boot.actuate.autoconfigure.cassandra.CassandraHealthContributorAutoConfiguration::class,
            org.springframework.boot.autoconfigure.couchbase.CouchbaseAutoConfiguration::class,
            org.springframework.boot.autoconfigure.data.couchbase.CouchbaseDataAutoConfiguration::class,
            org.springframework.boot.autoconfigure.data.couchbase.CouchbaseRepositoriesAutoConfiguration::class,
            org.springframework.boot.autoconfigure.data.couchbase.CouchbaseReactiveDataAutoConfiguration::class,
            org.springframework.boot.autoconfigure.data.couchbase.CouchbaseReactiveRepositoriesAutoConfiguration::class,
            org.springframework.boot.actuate.autoconfigure.couchbase.CouchbaseHealthContributorAutoConfiguration::class,
            org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchDataAutoConfiguration::class,
            org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchRepositoriesAutoConfiguration::class,
            org.springframework.boot.autoconfigure.data.elasticsearch.ReactiveElasticsearchRepositoriesAutoConfiguration::class,
            org.springframework.boot.autoconfigure.data.elasticsearch.ReactiveElasticsearchRestClientAutoConfiguration::class,
            org.springframework.boot.actuate.autoconfigure.elasticsearch.ElasticSearchRestHealthContributorAutoConfiguration::class,
            org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration::class,
            org.springframework.boot.actuate.autoconfigure.metrics.amqp.RabbitMetricsAutoConfiguration::class,
            org.springframework.boot.actuate.autoconfigure.amqp.RabbitHealthContributorAutoConfiguration::class,
            org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration::class,
            org.springframework.boot.actuate.autoconfigure.metrics.KafkaMetricsAutoConfiguration::class,
            org.springframework.boot.autoconfigure.jms.activemq.ActiveMQAutoConfiguration::class,
            org.springframework.boot.autoconfigure.rsocket.RSocketServerAutoConfiguration::class,
            org.springframework.boot.autoconfigure.rsocket.RSocketRequesterAutoConfiguration::class,
            org.springframework.boot.autoconfigure.rsocket.RSocketMessagingAutoConfiguration::class,
            org.springframework.boot.autoconfigure.rsocket.RSocketStrategiesAutoConfiguration::class,
            org.springframework.boot.autoconfigure.security.rsocket.RSocketSecurityAutoConfiguration::class,
            org.springframework.boot.autoconfigure.quartz.QuartzAutoConfiguration::class,
            org.springframework.boot.autoconfigure.mail.MailSenderAutoConfiguration::class,
            org.springframework.boot.autoconfigure.mail.MailSenderValidatorAutoConfiguration::class,
            org.springframework.boot.actuate.autoconfigure.mail.MailHealthContributorAutoConfiguration::class,
            org.springframework.boot.autoconfigure.security.oauth2.client.servlet.OAuth2ClientAutoConfiguration::class,
            org.springframework.boot.autoconfigure.security.oauth2.resource.servlet.OAuth2ResourceServerAutoConfiguration::class,
            org.springframework.boot.autoconfigure.ldap.LdapAutoConfiguration::class
        ]
)
@org.springframework.scheduling.annotation.EnableScheduling
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
