int speaker = 8;
int melody[] = {262, 294, 330, 249, 392, 440};
void setup() {
  pinMode(speaker, OUTPUT);
}

void loop() {
  digitalWrite(speaker, HIGH);
  delay(500);
  digitalWrite(speaker, LOW);
  delay(500);
}
