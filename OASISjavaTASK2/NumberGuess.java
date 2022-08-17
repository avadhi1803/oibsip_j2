import javax.swing.JOptionPane;
import java.util.Random;

class Validation
{
static int COUNT=0;
static int guess;

static void intro() throws Exception
{
JOptionPane.showMessageDialog(null,"Hello There! \nWelcome to the Number Guessing Game!");
JOptionPane.showMessageDialog(null,"INSTRUCTIONS \n\n1) You have to guess the number between 0 and 100. \n2) If your guess is correct, then you'll win the game. \n3) You'll get 5 attempts, to guess the number. \n4) Hints will be shown, depending on your guess. \n\nNow, let's start the GAME!!!");
}


static void attempts(int num) throws Exception
{
++COUNT;
guess = Integer.parseInt(JOptionPane.showInputDialog("Guess the number"));
if(guess==num)
{
JOptionPane.showMessageDialog(null,"Hurrah! You guessed the number.");
result();
}
else
{
if(COUNT<5)
{
if(guess>(num-10) && guess<num)
{
JOptionPane.showMessageDialog(null,"Your guess is lower than the generated number, but it's nearby.");
attempts(num);
}
else if(guess>num && guess<(num+10))
{
JOptionPane.showMessageDialog(null,"Your guess is higher than the generated number, but it's nearby.");
attempts(num);
}
else if(guess<(num-10))
{
JOptionPane.showMessageDialog(null,"Your guess is lower than the generated number.");
attempts(num);
}
else if(guess>(num+10))
{
JOptionPane.showMessageDialog(null,"Your guess is higher than the generated number");
attempts(num);
}
}
else
{
JOptionPane.showMessageDialog(null,"You have crossed the number of attempts. You Lost!");
}
}
}

static void result() throws Exception
{
if(COUNT==1)
{
JOptionPane.showMessageDialog(null,"You guessed the number in 1 attempt. \nYour score is 20 points.");
}
else if(COUNT==2)
{
JOptionPane.showMessageDialog(null,"You guessed the number in 2 attempts. \nYour score is 40 points.");
}
else if(COUNT==3)
{
JOptionPane.showMessageDialog(null,"You guessed the number in 3 attempts. \nYour score is 60 points.");
}
else if(COUNT==4)
{
JOptionPane.showMessageDialog(null,"You guessed the number in 4 attempts. \nYour score is 80 points.");
}
else if(COUNT==5)
{
JOptionPane.showMessageDialog(null,"You guessed the number in 5 attempts. \nYour score is 100 points.");
}
}
}

class NumberGuess
{
static public void main(String...ar) throws Exception
{
Random obj = new Random();
int upperbound=101;
int number = obj.nextInt(upperbound);
Validation.intro();
Validation.attempts(number);
}
}