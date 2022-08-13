public class DanceStudio
{
  public static void main(String[] args)
  {
    DanceFloor danceFloor = new DanceFloor();
    StudentGroup students = new SpinnerGroup(danceFloor);
    new DanceLesson(students, danceFloor);
  }
}
