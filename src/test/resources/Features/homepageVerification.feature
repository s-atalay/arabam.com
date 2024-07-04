Feature: Home page verification
  Background:
    * Open browser and go to "URL"

  Scenario: Logo visibility and functionality verification
    * Verify that the logo is visible
    * Click on the logo
    * Verify that the "arabam.com: 2. El ve 0 Km Satılık Araç İlanları Platformu" page is opened

  Scenario: Search box visibility and functionality verification
    * Verify that the search box is visible
    * Click on the search box
    * Type "Suzuki" into the search box

  Scenario: Search icon visibility and functionality verification
    * Verify that the search icon is visible
    * Click on the search box
    * Type "Suzuki" into the search box
    * Click on the search icon
    * Verify that "Suzuki" search results are opened

  Scenario: "Giriş Yap" button visibility and functionality verification
    * Verify that the "Giriş Yap" button is visible
    * Click on the "Giriş Yap" button
    * Verify that the "Üye Girişi" page is opened

  Scenario: "Üye Ol" button visibility and functionality verification
    * Verify that the "Üye ol" button is visible
    * Click on the "Üye ol" button
    * Verify that the "Üye Ol" page is opened

  Scenario: "Ücretsiz İlan Ver" button visibility and functionality verification
    * Verify that the Ücretsiz İlan Ver button is visible
    * Move the mouse over the Ücretsiz İlan Ver button
    * Verify that the Ücretsiz İlan Ver button and Trink Sat button are visible

  Scenario: Vitrin section visibility and functionality verification
    * Verify that the Vitrin title is visible
    * Verify that 24 ad links is visible and clickable under the Vitrin title

  Scenario: Son 24 Saat title visibility and functionality verification
    * Verify that the "Son 24 Saat" is visible
    * Click on the "Son 24 Saat" title
    * Verify that posting dates are from the last 24 hours

  Scenario: Son 48 Saat title visibility and functionality verification
    * Verify that the "48 Saat" is visible
    * Click on the "48 Saat" title
    * Verify that posting dates are from the last 48 hours

  Scenario: Acil İlanlar title visibility and functionality verification
    * Verify that the "Acil İlanlar" is visible
    * Click on the "Acil İlanlar" title
    * Verify that ads with "Acil" is visible

  Scenario: Fiyatı Düşenler title visibility and functionality verification
    * Verify that the "Fiyatı Düşenler" is visible
    * Click on the "Fiyatı Düşenler" title
    * Verify that listings with reduced prices have appeared