package GestaoFuSEx.repository;

import GestaoFuSEx.entity.EmpenhoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpenhoRepository extends JpaRepository<EmpenhoEntity, Long> {
}