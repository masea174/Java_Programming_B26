package day60_collections.social_media;

public class Picture {
    /*
    Picture class

• Create a class that has the following instance variable:
- byte [] image
- extension (String)
- caption

 - Encapsulate the caption.
 - make the image and extension final, private, and read-only (getter, but no
setter)

• Create a constructor that will take and initialize image, extension, and
caption

     */
   final private byte[] image;
    final private String extention;
    private String caption;

    public Picture(byte[] image, String extention, String caption) {
        this.image = image;
        this.extention = extention;
        this.caption = caption;
    }

    public byte[] getImage() {
        return image;
    }

    public String getExtention() {
        return extention;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }


}
