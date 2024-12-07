package constant;

public class CoreConstants {
    public CoreConstants() {
    }

    public static enum LocatorType {
        ID,
        NAME,
        LINK_TEXT,
        PARTIAL_LINK_TEXT,
        TAG_NAME,
        CLASS_NAME,
        CSS,
        XPATH;

        private LocatorType() {
        }
    }

    public static enum Platform {
        WINDOWS {
            public String toString() {
                return "WINDOWS";
            }
        },
        MAC {
            public String toString() {
                return "MAC";
            }
        },
        ANDROID {
            public String toString() {
                return "ANDROID";
            }
        },
        IOS,
        LINUX,
        OSX;

        private Platform() {
        }
    }

    public static enum Browser {
        FIREFOX,
        INTERNET_EXPLORER,
        SAFARI,
        CHROME,
        BROWSER,
        EDGE;

        private Browser() {
        }
    }
}
