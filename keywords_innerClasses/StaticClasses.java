package keywords_innerClasses;

public class StaticClasses {
    public StaticClasses() {
    }

    /* First inner class :: inner classes are allowed to be private/protected/public
     * whilst main classes can only be public */
    public class firstClass {
        private String name;

        /* Inner classes can have their on constructors */
        public firstClass(String name) {
            this.name = name;
        }

        /* May also define their own getters and setters */
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class secondClass {
        private String name;
        public static int id;

        public secondClass(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static int getId() {
            return id;
        }

        public static void setId(int id) {
            secondClass.id = id;
        }
    }

}
