package Project;
import Project.TextUtils;

public class TextUtilsTest {
    public static void main(String[] args) {

        System.out.println(TextUtils.normalizeName("  asha   nair "));
        System.out.println(TextUtils.normalizeName("DAVID"));
        System.out.println(TextUtils.normalizeName("  rahul   kumar  "));

        System.out.println("Successful normalizations: "
                + TextUtils.getCount());
    }
}
