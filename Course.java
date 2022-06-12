package lesson1;

public class Course {
    String result;
    private int run;
    private int swim;
    private int jump;


    public Course(int run, int swim, int jump) {
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }

    public String doIt(Team team) {
        result = "Команда : " + team.getName() + " " + '\n';
        for (Person person : team.getPeoples()) {
            result += "Имя спортсмена: " + person.getName() + " " + '\n';
            int value = person.getPower();
            testRun(value);
            testSwim(value);
            testJump(value);

        }

        return result;
    }

    private void testRun(int value) {
        if (value < run) {
            result +=" Cпортсмен не пробежал\n";
        } else {
            result += " Спортсмен пробежал дистанцию\n";
        }
    }


        private void testSwim(int value){
            if (value <= swim) {
                result += " Cпортсмен не доплыл\n";
            } else {
                result +=" Спортсмен проплыл дистанцию\n";
            }
        }

            private void testJump ( int value){
                if (value <= jump) {
                    result += " Cпортсмен не допрыгнул\n";
                } else {
                    result +=" Спортсмен перепрыгнул \n";
                }
            }
        }



