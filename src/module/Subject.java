package module;

public class Subject {
   public String physics;
   public String maths;
   public String chemistry;
   public String computer;
   public String english;
   int credithour;

   public Subject(String physics, String maths, String chemistry, String computer, String english, int credithour) {
      this.physics = physics;
      this.maths = maths;
      this.chemistry = chemistry;
      this.computer = computer;
      this.english = english;
      this.credithour = credithour;
   }

   public void setPhysics(String physics) {
      this.physics = physics;
   }

   public void setMaths(String maths) {
      this.maths = maths;
   }

   public void setChemistry(String chemistry) {
      this.chemistry = chemistry;
   }

   public void setComputer(String computer) {
      this.computer = computer;
   }

   public void setEnglish(String english) {
      this.english = english;
   }

   public void setCredithour(int credithour) {
      this.credithour = credithour;
   }

   public String getPhysics() {
      return physics;
   }

   public String getMaths() {
      return maths;
   }

   public String getChemistry() {
      return chemistry;
   }

   public String getComputer() {
      return computer;
   }

   public String getEnglish() {
      return english;
   }

   public int getCredithour() {
      return credithour;
   }
}