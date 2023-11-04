package prog.dist.api.repository;

import org.springframework.stereotype.Repository;
import prog.dist.api.model.User;

@Repository
public class UserRepository {
    public void save(User user){
        System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        System.out.println(user);
    }
}
