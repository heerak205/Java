/**
 * String matching.
 * @author Swapnika Vakacharla
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //not used.
    }
    /**
     * variable declaration.
     */
    private static final int THIRTEEN = 13;
    /**
     * variable declaration.
     */
    private static final int HUNDRED = 100;
    /**
     * variable declaration.
     */
    private static final double TWOHUNDRED = 200.0;
    /**
     * to calculate lcs.
     *
     * @param      doc1  The document 1
     * @param      doc2  The document 2
     *
     * @return     { description_of_the_return_value }
     */
    public static int lcs(final String doc1, final String doc2) {
        int lcsmaximum = 0, lcs = 0, temp = 0;
        for (int indexi = 0; indexi < doc1.length() - 1; indexi++) {
            int indexj = 0;
            while (indexj < doc2.length() - 1) {
                temp = indexi;
                lcs = 0;
                if (doc1.charAt(temp) == (doc2.charAt(indexj))
                        && doc1.charAt(temp) != ' ') {
                    while (doc1.charAt(temp) == (doc2.charAt(indexj)) && indexj
                            < doc2.length() - 1 && temp < doc1.length() - 1) {
                        lcs++;
                        indexj++;
                        temp++;
                    }
                    if (lcs > lcsmaximum) {
                        lcsmaximum = lcs;
                    }
                } else {
                    indexj++;
                }
            }
        }
        return lcsmaximum + 1;
    }
    /**
     * to print resultult in given format.
     *
     * @param      matchpercentmatching  The matchpercentmatching
     * @param      filelist         The filelist
     */
    public static void printresultult(final float[][] matchpercentmatching,
                                   final File[] filelist) {
        String[] fileListAsString = new String[filelist.length];
        for (int i = 0; i < filelist.length; i++) {
            for (int j = 0; i < filelist[i].toString().length(); j++) {
                if (filelist[i].toString().charAt(j) == '\\') {
                    fileListAsString[i] = filelist[i].toString()
                                          .substring(j + 1);
                    break;
                }
            }
        }
        String result = "         ";
        for (String eachFile : fileListAsString) {
            // result += eachFile + "\t";
            int numberOfSpaces = THIRTEEN - eachFile.length();
            for (int spindex = 0; spindex < numberOfSpaces; spindex++) {
                result += " ";
            }
            result += eachFile;
        } result += " \n";
        for (int i = 0; i < fileListAsString.length; i++) {
            result += fileListAsString[i];
            for (int j = 0; j < fileListAsString.length; j++) {
                // result += "\t" + matchpercentmatching[i][j] + "\t";
                int numberOfSpaces = THIRTEEN - (matchpercentmatching[i][j] + "")
                                     .length();
                for (int spindex = 0; spindex < numberOfSpaces; spindex++) {
                    result += " ";
                }
                result += matchpercentmatching[i][j] + "";

            } result += " \n";
        }
        System.out.print(result);
        float maxpercentmatching = 0;
        String file1 = "", file2 = "";
        for (int i = 0; i < filelist.length; i++) {
            for (int j = 0; j < filelist.length; j++) {
                if (i < j && maxpercentmatching < matchpercentmatching[i][j]) {
                    file1 = fileListAsString[i];
                    file2 = fileListAsString[j];
                    maxpercentmatching = matchpercentmatching[i][j];
                }
            }
        }
        System.out.println("Maximum similarity is between "
                           + file1 + " and " + file2);
    }
    /**
     * main function.
     *
     * @param      args       The arguments
     *
     * @throws     Exception  { exception_description }
     */
    public static void main(final String[] args) throws Exception {
        try {
            Scanner scan = new Scanner(System.in);
            String foldername = scan.next();
            File folder = new File(foldername);
            File[] filelist = folder.listFiles();
            String[] strlist = new String[filelist.length];
            // System.out.println(Arrays.toString(filelist));
            try {
                int filecount = 0;
                for (File file : filelist) {
                    Scanner filescan = new Scanner(file);
                    String str = "";
                    while (filescan.hasNextLine()) {
                        str += filescan.nextLine() + " ";
                    }
                    // System.out.println(str);
                    strlist[filecount++] = str.trim();
                }
                // System.out.println(Arrays.toString(strlist));
            } catch (FileNotFoundException e) {
                System.out.println("file not found");
            }

            float[][] matchpercentmatching = new float[filelist.length]
            [filelist.length];
            for (int i = 0; i < filelist.length; i++) {
                for (int j = 0; j < filelist.length; j++) {
                    if (i == j) {
                        matchpercentmatching[i][j] = HUNDRED;
                    } else {
    // int lcs = 0 , lcstemp = 0;
    // // System.out.println(strlist[i] + "\n" + strlist[j]);
    // for (String eachwordi : strlist[i].replace(".", " ").split(" ")) {
    //  for (String eachwordj : strlist[j].replace(".", " ").split(" ")) {
    //      if (eachwordi.equals(eachwordj) && eachwordi.length() > lcs) {
    //          lcs = eachwordi.length();
    //      }
    //  }
    // }
    // matchpercentmatching[i][j] = (lcs * 200)
    // / (strlist[i].length() + strlist[j].length());

                        int lcsmaximum = 0;
                        if (!(strlist[i].equals("") || strlist[j]
                                .equals(""))) {
                            if (strlist[i].length() > strlist[j]
                                    .length()) {
                                lcsmaximum = lcs(strlist[i], strlist[j]);
                            } else {
                                lcsmaximum = lcs(strlist[j], strlist[i]);
                            }
                        }
                        matchpercentmatching[i][j] = Math.round((lcsmaximum * TWOHUNDRED)
                            / (strlist[i].length() + strlist[j].length()));
                    }
                }
            }
            // System.out.println(Arrays.toString(matchpercentmatching));
            // for (int i = 0; i < matchpercentmatching.length; i++) {
            //  System.out.println(Arrays.toString(matchpercentmatching[i]));
            // }
            printresultult(matchpercentmatching, filelist);
        } catch (Exception e) {
            System.out.println("Empty Directory");
        }
    }
}

