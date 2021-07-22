int btnPin = 2;


void setup() {
  pinMode(btnPin, INPUT);
  Serial.begin(9600);
  
  

}

void loop() {
  int value = digitalRead(btnPin);
  Serial.println(value);

  delay(100);
  
}
