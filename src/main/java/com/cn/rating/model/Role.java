package com.cn.rating.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import org.apache.logging.log4j.message.AsynchronouslyFormattable;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "role")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    @Getter
    private Long id;

    @Column(name = "role_name")
    @Getter
    @Setter
    private String roleName;

    @ManyToMany(mappedBy = "roleList")
    @JsonBackReference
    @Getter
    @Setter
    private Set<User> userList;
}
