Feature: Search verification
  Background:
    * Open browser and go to "URL"
  @demo
  Scenario: Search for specific ad and verify that the result
    * Click on the "Motosiklet" category
    * Click on the "Suzuki" title
    * Click on the "Burgman AN 650 ABS" title
    * Click on the Yıl title
    * Enter "2000" for min year and "2001" for max year
    * Click on the Ara button
    * Verify that "Sonuç bulunamadı." error is visible
