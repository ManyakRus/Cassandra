package sanek.cassandra.config;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.CassandraCqlClusterFactoryBean;
import org.springframework.data.cassandra.config.CassandraCqlSessionFactoryBean;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@EnableCassandraRepositories
public class CassandraConfig
        //extends AbstractCassandraConfiguration
 {

    /*
     * Provide a contact point to the configuration.
     */
//    public String getContactPoints() {
//        return "localhost";
//    }
//
//    /*
//     * Provide a keyspace name to the configuration.
//     */
//    public String getKeyspaceName() {
//        return "sample";
//    }
}
