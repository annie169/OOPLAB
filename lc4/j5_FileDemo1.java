import java.io.File;
//labcycle 5th question
class j5_FileDemo1 {
  public static void main(String[] args) {

    // creates a file object
    File file = new File("/home/user");


    // returns an array of all files
    String[] fileList = file.list();

    for(String str : fileList) {
      System.out.println(str);
    }
  }
}

