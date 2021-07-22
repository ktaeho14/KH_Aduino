int btn = 2;
int ledPin = 13;
int ledPin2 = 4;


void setup() {
  pinMode(btn, INPUT);
  pinMode(ledPin, OUTPUT);
  pinMode(ledPin, OUTPUT);
  Serial.begin(9600);
}

void loop() {
  int value = digitalRead(btn);
  Serial.println(value);

  if(value == HIGH){
    digitalWrite(ledPin, HIGH);
    digitalWrite(ledPin2, LOW);
  }else{
    digitalWrite(ledPin, LOW);
    digitalWrite(ledPin2, HIGH);
  }

  delay(100);
}
