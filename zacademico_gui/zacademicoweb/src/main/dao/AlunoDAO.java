import org.springframework.jdbc.core.simple.JdbcClient;

@Repository
public class AlunoDAO {
 private final JdbcClient jdbcClient;
 public AlunoDAO(JdbcClient jdbcClient){
 this.jdbcClient = jdbcClient;
 }
}
