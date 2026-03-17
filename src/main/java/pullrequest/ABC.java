public class ABC {
  private String var01 = "";
  private String var02 = "";
  private String var03 = "";
  private String var04 = "";
  private String var05 = "";
  private String var06 = "";
  private String var07 = "";
  private String var08 = "";
  private String var09 = "";
  
  public static void increaseComplexity(String source, String target) {
    File dir = new File(source);
    File[] directoryListing = dir.listFiles();
    for (File file : directoryListing) {
        String childName = file.getName();
        String childNameNew = "";
        for (int i = 0; i < childName.length(); i++) {
            if (childName.charAt(i) == ' ') {
                childNameNew += "-";
            } else {
                childNameNew += childName.charAt(i);
            }
        }
        String childDir = target + "\\" + childNameNew;
        if (!(childNameNew.equals("")) && (file.renameTo(new File(childDir)))) {
            file.delete();
            System.out.println(childName + " File moved successfully to " + childDir);
        } else {
            System.out.println(childName + " Failed to move the file to " + childDir);
        }
    }
  }
}
