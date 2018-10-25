package binary;
// Fig. 6.13: Fibonacci.java
// Recursive fibonacci method
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Fibonacci extends JApplet implements ActionListener {
   JLabel numLabel, resultLabel;
   JTextField num, result;

   public void init()
   {
      Container c = getContentPane();
      c.setLayout( new FlowLayout() );

      numLabel = 
         new JLabel( "Enter an integer and press Enter" );
      c.add( numLabel );

      num = new JTextField( 10 );
      num.addActionListener( this );        //register the text field for action
      c.add( num );

      resultLabel = new JLabel( "Fibonacci value is" );
      c.add( resultLabel );
 
      result = new JTextField( 15 );
      result.setEditable( false );
      c.add( result );
   }

   public void actionPerformed( ActionEvent e )
   {  
      int number;
      long fibonacciValue;

      number = Integer.parseInt( num.getText() );
      showStatus( "Calculating ..." ); 
      //fibonacciValue = fibonacci( number );     //recursive method
      fibonacciValue = nonRecursiveFibonacci( number );
      showStatus( "Done." );   
      result.setText( Long.toString( fibonacciValue ) );
   }
  
   // Recursive definition of method fibonacci
   public long fibonacci( int n )
   {
      if ( n == 0 || n == 1 )  // base case
         return n;
      else
         return fibonacci( n - 1 ) + fibonacci( n - 2 );
   }
   
    // Nonrecursive version of fibonacci
    public long nonRecursiveFibonacci(int n)
    {
        int fib0 = 1;
        int fib1 = 1;
        int fib2 = fib1 + fib0;

        for (int i = 3; i <= n; i++)
        {
            fib0 = fib1;
            fib1 = fib2;
            fib2 = fib1 + fib0;

        }
        return fib1;
    }

}
