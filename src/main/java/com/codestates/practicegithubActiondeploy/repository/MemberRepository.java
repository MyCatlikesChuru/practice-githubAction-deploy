package com.codestates.practicegithubActiondeploy.repository;

import com.codestates.practicegithubActiondeploy.entity.Member;
import lombok.extern.java.Log;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
