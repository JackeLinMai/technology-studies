

// C++ code
//
const int sensor= A0;
const int LED= 2;
const int buzz= 5;
const int motor=7;
void setup()
{
        Serial.begin(9600);
    pinMode(motor, OUTPUT);
    pinMode(LED, OUTPUT);
    pinMode(buzz, OUTPUT);
}

void loop()
{
  int temperature =(analogRead(sensor));
  float voltage = temperature*(5.0/1023.0);
  float celsiusTemperature = (voltage-0.5)*100;
  
  //Defining our program for what to do in temperature changes
  
  if (celsiusTemperature>=30 & celsiusTemperature<=50 ){
  		digitalWrite(motor, HIGH);
    	delay(1000);
  }else if(celsiusTemperature >50){
  	digitalWrite(motor, HIGH);
    digitalWrite(LED, HIGH);
    digitalWrite(buzz,LOW);
  }else{
  	digitalWrite(motor,LOW);
    digitalWrite(LED,LOW);
    digitalWrite(buzz,HIGH);
  }
  Serial.print("Tempearature= ");
  Serial.print(celsiusTemperature);
  Serial.println(" C");
  delay(2000);
}