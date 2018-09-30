package com.nault.helloexpertusapi.repository;

import com.nault.helloexpertusapi.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Repository to access the data in DB.
 */
@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

    @Query("SELECT message FROM Message message WHERE message.language = :language")
    Message findByLanguage(@Param("language") String language);
}
