package com.example.scicalc;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main extends Activity {
	
	float prev, curr, result,temp2=0;
	int a;
	double temp1;
	//CharSequence x;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bd,add, sub, mul, div, eq,sin,cos,tan,log,back,clr;
	TextView edit,text;
	
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        add= (Button) findViewById(R.id.button2);
        sub= (Button) findViewById(R.id.Button11);
        mul= (Button) findViewById(R.id.Button12);
        div= (Button) findViewById(R.id.Button13);
        eq= (Button) findViewById(R.id.button3);
        back= (Button) findViewById(R.id.button5);
        
        b1= (Button) findViewById(R.id.button1);
        b2= (Button) findViewById(R.id.Button01);
        b3= (Button) findViewById(R.id.Button02);
        b4= (Button) findViewById(R.id.Button03);
        b5= (Button) findViewById(R.id.Button04);
        b6= (Button) findViewById(R.id.Button05);
        b7= (Button) findViewById(R.id.Button06);
        b8= (Button) findViewById(R.id.Button07);
        b9= (Button) findViewById(R.id.Button08);
        b0= (Button) findViewById(R.id.Button09);
        bd= (Button) findViewById(R.id.Button10);
        
        sin= (Button) findViewById(R.id.button4);
        cos= (Button) findViewById(R.id.Button14);
        tan= (Button) findViewById(R.id.Button15);
        log= (Button) findViewById(R.id.Button16);
        
        clr= (Button) findViewById(R.id.button17);
        
        edit=(TextView) findViewById(R.id.editText1);
        text=(TextView) findViewById(R.id.txtview2);
        
        sin.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				temp1= Math.toRadians(curr);
				result= (float) Math.sin(temp1);
				curr=result;
				edit.setText(""+result);
				text.setText(""+result);
			}
		});
        
        cos.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				temp1= Math.toRadians(curr);
				result= (float) Math.cos(temp1);
				curr=result;
				edit.setText(""+result);
				text.setText(""+result);
			}
		});
        
        tan.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				temp1= Math.toRadians(curr);
				result= (float) Math.tan(temp1);
				curr=result;
				edit.setText(""+result);
				text.setText(""+result);
			}
		});
        
        log.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				result= (float) Math.log(curr);
				curr=result;
				edit.setText(""+result);
				text.setText(""+result);
			}
		});
        
        b1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				edit.setText(edit.getText()+""+b1.getText());
				text.setText(text.getText()+""+b1.getText());
				curr=Float.parseFloat(edit.getText().toString());
			}
		});
        b2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				edit.setText(edit.getText()+""+b2.getText());
				text.setText(text.getText()+""+b2.getText());
				curr=Float.parseFloat(edit.getText().toString());
			}
		});
        b3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				edit.setText(edit.getText()+""+b3.getText());
				text.setText(text.getText()+""+b3.getText());
				curr=Float.parseFloat(edit.getText().toString());
			}
		});
        b4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				edit.setText(edit.getText()+""+b4.getText());
				text.setText(text.getText()+""+b4.getText());
				curr=Float.parseFloat(edit.getText().toString());
			}
		});
        b5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				edit.setText(edit.getText()+""+b5.getText());
				text.setText(text.getText()+""+b5.getText());
				curr=Float.parseFloat(edit.getText().toString());
			}
		});
        b6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				edit.setText(edit.getText()+""+b6.getText());
				text.setText(text.getText()+""+b6.getText());
				curr=Float.parseFloat(edit.getText().toString());
			}
		});
        b7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				edit.setText(edit.getText()+""+b7.getText());
				text.setText(text.getText()+""+b7.getText());
				curr=Float.parseFloat(edit.getText().toString());
			}
		});
        b8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				edit.setText(edit.getText()+""+b8.getText());
				text.setText(text.getText()+""+b8.getText());
				curr=Float.parseFloat(edit.getText().toString());
			}
		});
        b9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				edit.setText(edit.getText()+""+b9.getText());
				text.setText(text.getText()+""+b9.getText());
				curr=Float.parseFloat(edit.getText().toString());
			}
		});
        b0.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				edit.setText(edit.getText()+""+b0.getText());
				text.setText(text.getText()+""+b0.getText());
				curr=Float.parseFloat(edit.getText().toString());
			}
		});
        bd.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(curr==0)
				{
					edit.setText(edit.getText()+""+0+""+bd.getText());
					text.setText(text.getText()+""+0+""+bd.getText());
				}
				else
				{
					edit.setText(edit.getText()+""+bd.getText());
					text.setText(text.getText()+""+bd.getText());
				}
				
				curr=Float.parseFloat(edit.getText().toString());
			}
		});
        
        back.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String str=edit.getText().toString();
				String str2=text.getText().toString();
	            if (str.length() >1 )
	            { 
	                str = str.substring(0, str.length() - 1);
	                edit.setText(str);
	                curr=Float.parseFloat(edit.getText().toString());
	            }
	             else
	             {
	                edit.setText("");
	                curr=temp2=0;
	             }
	            if(str2.length()>1)
	            {
	            	str2 = str2.substring(0, str2.length() - 1);
	            	text.setText(str2);
	            }
	            else
	            {
	            	text.setText("");
	            }
	            
	            
			}
		});
        clr.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				curr=result=prev=temp2=a=0;
				edit.setText("");
				text.setText("");
			}
		});
        
        
        add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(result==0)
					text.setText(text.getText()+""+"+");
				else
				{
					text.setText(""+result+""+"+");
					result=0;
				}
					
				
				
				if(a==0)
					temp2=temp2+curr;
				else
				{
					if(a==1)
						temp2=temp2+curr;
					else if(a==2)
						temp2=temp2-curr;
					else if(a==3)
					{
						if(temp2!=0)
							temp2=temp2*curr;
						else
							temp2=curr;
					}
					else if(a==4)
					{
						try{
							if(temp2!=0)
								temp2=temp2/curr;
							else
								temp2=curr;
						}
						catch(ArithmeticException e)
						{
							e.printStackTrace();
						}
					}
				}
				
					
					
				
				prev=curr;
				curr=0;
				
				a=1;
				
				/*try{
					result+=prev+curr;
					//edit.setText(""+result);
					curr=result;
				}
				catch(ArithmeticException e)
				{
					e.printStackTrace();
				}*/
				edit.setText("");
				
			}
		});
        
        
        sub.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(result==0)
					text.setText(text.getText()+""+"-");
				else
				{
					text.setText(""+result+""+"-");
					result=0;
				}
				if(a==0)
					temp2=curr-temp2;
				else
				{
					if(a==1)
						temp2=temp2+curr;
					else if(a==2)
						temp2=temp2-curr;
					else if(a==3)
					{
						if(temp2!=0)
							temp2=temp2*curr;
						else
							temp2=curr;
					}
					else if(a==4)
					{
						try{
							if(temp2!=0)
								temp2=temp2/curr;
							else
								temp2=curr;
						}
						catch(ArithmeticException e)
						{
							e.printStackTrace();
						}
					}
				}
				
				prev=curr;
				curr=0;
				
				a=2;
				
				/*try{
					result=prev-curr;
					//edit.setText(""+result);
					curr=result;
				}
				catch(ArithmeticException e)
				{
					e.printStackTrace();
				}*/
				edit.setText("");
			}
		});
        
        mul.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(result==0)
					text.setText(text.getText()+""+"*");
				else
				{
					text.setText(""+result+""+"*");
					result=0;
				}
				if(a==0)
				{
					if(temp2!=0)
						temp2=temp2*curr;
					else
						temp2=curr;
				}
				else
				{
					if(a==1)
						temp2=temp2+curr;
					else if(a==2)
						temp2=temp2-curr;
					else if(a==3)
					{
						if(temp2!=0)
							temp2=temp2*curr;
						else
							temp2=curr;
					}
					else if(a==4)
					{
						try{
							if(temp2!=0)
								temp2=temp2/curr;
							else
								temp2=curr;
						}
						catch(ArithmeticException e)
						{
							e.printStackTrace();
						}
					}
				}
				prev=curr;
				curr=0;
				a=3;
				
				/*try{
					result=prev*curr;
					//edit.setText(""+result);
					curr=result;
				}
				catch(ArithmeticException e)
				{
					e.printStackTrace();
				}*/
				edit.setText("");
			}
		});
 
 		div.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			if(result==0)
				text.setText(text.getText()+""+"/");
			else
			{
				text.setText(""+result+""+"/");
				result=0;
			}
			if(a==0)
			{
				try{
					if(temp2!=0)
						temp2=temp2/curr;
					else
						temp2=curr;
				}
				catch(ArithmeticException e)
				{
					e.printStackTrace();
				}
			}
			else
			{
				if(a==1)
					temp2=temp2+curr;
				else if(a==2)
					temp2=temp2-curr;
				else if(a==3)
				{
					if(temp2!=0)
						temp2=temp2*curr;
					else
						temp2=curr;
				}
				else if(a==4)
				{
					try{
						if(temp2!=0)
							temp2=temp2/curr;
						else
							temp2=curr;
					}
					catch(ArithmeticException e)
					{
						e.printStackTrace();
					}
				}
			}
			
			prev=curr;
			curr=0;
			a=4;
			
			
			/*try{
				result=prev/curr;
				//edit.setText(""+result);
				curr=result;
			}
			catch(ArithmeticException e)
			{
				e.printStackTrace();
			}*/
			edit.setText("");
			}
			
			
 		});
 
 	eq.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		//curr=Float.parseFloat(edit.getText().toString());
		text.setText(text.getText()+""+"=");
		switch(a)
		{
		case 1:
			result=temp2+curr;
			edit.setText(""+result);
			text.setText(text.getText()+""+result);
			curr=result;
			temp2=a=0;
			
			break;
		case 2:
			result=temp2-curr;
			edit.setText(""+result);
			text.setText(text.getText()+""+result);
			curr=result;
			temp2=a=0;
			break;
		case 3:
			if(temp2==0)
				result=prev*curr;
			else
				result=temp2*curr;
			edit.setText(""+result);
			text.setText(text.getText()+""+result);
			curr=result;
			temp2=a=0;
			break;
		case 4:
			try{
				result=temp2/curr;
				edit.setText(""+result);
				text.setText(text.getText()+""+result);
				curr=result;
				temp2=a=0;
			}
			catch(ArithmeticException e)
			{
				e.printStackTrace();
			}
			
			break;
			
		
		}
		
		
	}
 	});
        
        
}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
