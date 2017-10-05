package com.megacorp.test;

import java.io.IOException;

import com.megacorp.domain.Member;
import com.megacorp.utils.MemberFileReader;
import com.megacorp.utils.MemberFileException;

public class MemberFileReaderTest {

  public static void main(String[] args) {
    try {
      MemberFileReader.readMemberFile("members.csv");
    } catch (MemberFileException|IOException e) {
      e.printStackTrace();
    }
  }
  
}
