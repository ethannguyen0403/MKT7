package test;

import ObjectPage.VicClub2Page;
import common.BaseCaseTest;
import org.testng.annotations.Test;

public class CheckTest extends BaseCaseTest {
    @Test(groups = {"smoke"})
    public void Check_Test_Vic_Club() {
           log("@Title: Check Test");
           VicClub2Page vicClub2Page = new VicClub2Page();
       }
}
