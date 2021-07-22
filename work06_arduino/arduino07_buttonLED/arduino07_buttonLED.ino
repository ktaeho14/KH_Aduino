int btnPin = 2;
int ledPin = 13;


void setup() {
  pinMode(btnPin, INPUT);
  pinMode(ledPin, OUTPUT);
  Serial.begin(9600);
  
}

void loop() {
  int value = digitalRead(btnPin);
  Serial.println(value);

  if(value == HIGH){
    digitalWrite(ledPin,HIGH);
    
  }else{
    digitalWrite(ledPin, LOW);
  }

  delay(100);

  
}
