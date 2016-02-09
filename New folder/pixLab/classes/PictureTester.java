/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
   /** Method to test keepOnlyBlue */
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
   /** Method to test greyScale */
  public static void testGrayScale()
  {
    Picture beach = new Picture("dog.jpg");
    beach.explore();
    beach.greyScale();
    beach.explore();
  }
   /** Method to test negative*/
  public static void testNegate()
  {
    Picture dog = new Picture("dog.jpg");
    dog.explore();
    dog.negative();
    dog.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("dog.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  /** Method to test mirrorVerticalR2L */
  public static void testMirrorVerticalR2L()
  {
    Picture caterpillar = new Picture("dog.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalR2L();
    caterpillar.explore();
  }
  /** Method to test mirrorHorizontal */
  public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("beach.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }
  /** Method to test mirrorDiagonal */
  public static void testMirrorDiagonal()
  {
    Picture caterpillar = new Picture("dog.jpg");
    caterpillar.explore();
    caterpillar.mirrorDiagonal();
    caterpillar.explore();
  }
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  /** Method to test mirrorPartOfPic */
  public static void testMirrorPartOfPic()
  {
    Picture temple = new Picture("dog.jpg");
    temple.explore();
    temple.mirrorPartOfPic();
    temple.explore();
  }
  /** Method to test water */
  public static void testFixUnderwater()
  {
    Picture temple = new Picture("water.jpg");
    temple.explore();
    temple.fixUnderwater();
    temple.explore();
  }
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("dog.jpg");
    swan.edgeDetection(25);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayScale();
    testFixUnderwater();
    //testMirrorVertical();
    //testMirrorVerticalR2L();
    //testMirrorHorizontal();
    //testMirrorTemple();
    //testMirrorPartOfPic();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}