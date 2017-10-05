package com.megacorp.utils;

import java.util.List;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.util.stream.Collectors;

import com.megacorp.domain.Member;

public class MemberFileReader {


  public static List<Member> readMemberFile(String fileName) throws MemberFileException, IOException {
    return Files.lines(Paths.get(fileName))
      .map(s -> new Member(s.split(";")[0],
                           s.split(";")[1],
                           Integer.parseInt(s.split(";")[2])))
      .collect(Collectors.toList());
  }
}
