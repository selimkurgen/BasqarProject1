package PageModels;

import org.openqa.selenium.By;

public interface HomePageObjects {

    By LoginButton = By.id("login");
    By LoginPageUserName = By.cssSelector("input[formcontrolname='username']");
    By LoginPagePassword = By.cssSelector("input[formcontrolname='password']");
    By LoginPageSubmitButton =  By.cssSelector("button.submit-button");
    By CookieDialogBox = By.cssSelector("div[role='dialog']");
    By CookieDialogButton = By.partialLinkText("Got it");
    By UserButton = By.cssSelector("button.user-button");
    By NavMenu = By.tagName("fuse-sidebar");    // By.cssSelector("navbar.left-navbar");
    By NavMenuToggleButton = By.xpath("(//toolbar//button)[1]");
    By ToggleSideBarFolded = By.cssSelector("button.toggle-sidebar-folded");
    By NavbarToggleButton = By.cssSelector("button.navbar-toggle-button");
    By UserMenuVisible = By.cssSelector("span.username");
    By UserMenuHidden = By.cssSelector("div.avatar-container");
    By LeftMenuLinksContainer = By.cssSelector("div.navbar-scroll-container");
    By Logout = By.xpath("//*[text()='Sign out']");

}
