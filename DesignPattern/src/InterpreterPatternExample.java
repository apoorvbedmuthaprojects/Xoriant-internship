import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;

class Context{
	public String expression;
	public Date   date;

	public String getExpression()
	{
		return expression;
	}

	public void setExpression( String expression )
	{
		this.expression = expression;
	}

	public Date getDate()
	{
		return date;
	}

	public void setDate( Date date )
	{
		this.date = date;
	}

}


abstract class AbstractExpression{
	public abstract void evaluate( Context context );
}




class DayExpression extends AbstractExpression{

	@Override
	public void evaluate( Context context )
	{
		String expression = context.getExpression();
		Date date = context.getDate();
		Integer day = new Integer(date.getDate());
		String tempExpression = expression.replaceAll("DD", day.toString());
		context.setExpression(tempExpression);
	}
}


class MonthExpression extends AbstractExpression{

	@Override
	public void evaluate( Context context )
	{
		String expression = context.getExpression();
		Date date = context.getDate();
		Integer month = new Integer(date.getMonth()+1);
		String tempExpression = expression.replaceAll("MM", month.toString());
		context.setExpression(tempExpression);
	}	

}



class YearExpression extends AbstractExpression{

	@Override
	public void evaluate( Context context )
	{
		String expression = context.getExpression();
		Date date = context.getDate();
		Integer year = new Integer(date.getYear() + 1900);
		String tempExpression = expression.replaceAll("YYYY", year.toString());
		context.setExpression(tempExpression);
	}

}





public class InterpreterPatternExample{

	public static void main( String[] args )
	{
		// TODO Auto-generated method stub

		System.out.println("Please select the Expression  : 'MM-DD-YYYY' or 'YYYY-MM-DD'");
		Scanner scanner = new Scanner(System.in);
		String expression = scanner.next();
		
		Context context = new Context();
		context.setExpression(expression);
		context.setDate(new Date());

		ArrayList<AbstractExpression> expressionOrderList = getExpressionOrder(context);

		System.out.println("Input : " + context.getExpression() + " : " + new Date());

		for( AbstractExpression abstractExpression : expressionOrderList )
		{
			abstractExpression.evaluate(context);
			System.out.println(abstractExpression.getClass().getName() + " Evaluated     : " + context.getExpression());

		}

		System.out.println("Output : " + context.getExpression());
	}

	private static ArrayList<AbstractExpression> getExpressionOrder( Context context )
	{
		ArrayList<AbstractExpression> expressionOrderList = new ArrayList<AbstractExpression>();
		String[] strArray = context.getExpression().split("-");
		for( String string : strArray )
		{
			if( string.equalsIgnoreCase("MM") )
			{
				expressionOrderList.add(new MonthExpression());
			}
			else if( string.equalsIgnoreCase("DD") )
			{
				expressionOrderList.add(new DayExpression());
			}
			else
			{
				expressionOrderList.add(new YearExpression());
			}

		}
		return expressionOrderList;
	}

}

