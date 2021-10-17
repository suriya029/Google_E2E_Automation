$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Jalan.feature");
formatter.feature({
  "line": 1,
  "name": "To test whether google search functionality works as expected",
  "description": "",
  "id": "to-test-whether-google-search-functionality-works-as-expected",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "To test whether user is able to enter keyword in search box",
  "description": "",
  "id": "to-test-whether-google-search-functionality-works-as-expected;to-test-whether-user-is-able-to-enter-keyword-in-search-box",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User has to navigate to google site",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user has to click the text box",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User has to enter any text",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_has_to_navigate_to_google_site()"
});
formatter.result({
  "duration": 3200297000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_has_to_click_the_text_box()"
});
formatter.result({
  "duration": 3412418200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_has_to_enter_any_text()"
});
formatter.result({
  "duration": 4193773200,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "To test whether user is able to enter \u0027Special characters\u0027 in search box",
  "description": "",
  "id": "to-test-whether-google-search-functionality-works-as-expected;to-test-whether-user-is-able-to-enter-\u0027special-characters\u0027-in-search-box",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User has to navigate to google site",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "user has to click the text box",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User has to enter any special characters",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_has_to_navigate_to_google_site()"
});
formatter.result({
  "duration": 1589170500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_has_to_click_the_text_box()"
});
formatter.result({
  "duration": 3305151600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_has_to_enter_any_special_characters()"
});
formatter.result({
  "duration": 317868000,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Verify that user enter keyword and click \u0027Search\u0027 button fetches desired results",
  "description": "",
  "id": "to-test-whether-google-search-functionality-works-as-expected;verify-that-user-enter-keyword-and-click-\u0027search\u0027-button-fetches-desired-results",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "User has to navigate to google site",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "User has to enter a text in search box",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User has to click on the \u0027Search\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Searched relevant results must be returned",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_has_to_navigate_to_google_site()"
});
formatter.result({
  "duration": 1950657500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_has_to_enter_a_text_in_search_box()"
});
formatter.result({
  "duration": 1283352200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_has_to_click_on_the_Search_button1()"
});
formatter.result({
  "duration": 4155347700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.searched_relevant_results_must_be_returned()"
});
formatter.result({
  "duration": 13620200,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Verify misspilled keyword got corrected automatically and results for correct keyword is displayed",
  "description": "",
  "id": "to-test-whether-google-search-functionality-works-as-expected;verify-misspilled-keyword-got-corrected-automatically-and-results-for-correct-keyword-is-displayed",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@mispilled"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "User has to navigate back to google site",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "User has to enter a misspelt text in search box",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User has to click on the \u0027Search\u0027 button.",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Searched corrected results must be returned",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_has_to_navigate_back_to_google_site()"
});
formatter.result({
  "duration": 489100000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_has_to_enter_a_misspelt_text_in_search_box()"
});
formatter.result({
  "duration": 1142118900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_has_to_click_on_the_Search_button11()"
});
formatter.result({
  "duration": 1572019400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.searched_corrected_results_must_be_returned()"
});
formatter.result({
  "duration": 1109481300,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Verify \u0027No result found\u0027 message when user enter invalid keyword",
  "description": "",
  "id": "to-test-whether-google-search-functionality-works-as-expected;verify-\u0027no-result-found\u0027-message-when-user-enter-invalid-keyword",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "User has to enter an invalid keyword",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "User has to click on the \u0027Search \u0027 button",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "\u0027No result found\u0027 page must be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_has_to_enter_an_invalid_keyword()"
});
formatter.result({
  "duration": 1913984100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_has_to_click_on_the_Search_button()"
});
formatter.result({
  "duration": 1201276200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.no_result_found_page_must_be_displayed()"
});
formatter.result({
  "duration": 1575172100,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Verify the functionality of \u0027I’m feeling Lucky\u0027 search",
  "description": "",
  "id": "to-test-whether-google-search-functionality-works-as-expected;verify-the-functionality-of-\u0027i’m-feeling-lucky\u0027-search",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 32,
  "name": "User has to click on \u0027Google\u0027 logo to navigate to main page",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "User has to enter a valod text in search bar",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "User has to tap \u0027I’m feeling Lucky\u0027 button",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "verify whether desired page is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_has_to_click_on_Google_logo_to_navigate_to_main_page()"
});
formatter.result({
  "duration": 3650918100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_has_to_enter_a_valod_text_in_search_bar()"
});
formatter.result({
  "duration": 193969600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_has_to_tap_I_m_feeling_Lucky_button()"
});
formatter.result({
  "duration": 4384281800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.verify_whether_desired_page_is_displayed()"
});
formatter.result({
  "duration": 492485800,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "Verify on tapping on \u0027Gmail\u0027 tab navigates to Gmail site",
  "description": "",
  "id": "to-test-whether-google-search-functionality-works-as-expected;verify-on-tapping-on-\u0027gmail\u0027-tab-navigates-to-gmail-site",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 38,
  "name": "User must be at \u0027Google home page\u0027",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "User must tap in \u0027Gmail\u0027 text",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "verify whether user in in gmail site",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_must_be_at_Google_home_page()"
});
formatter.result({
  "duration": 1354443400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_must_tap_in_Gmail_text()"
});
formatter.result({
  "duration": 2244670400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.verify_whether_user_in_in_gmail_site()"
});
formatter.result({
  "duration": 11575400,
  "status": "passed"
});
formatter.scenario({
  "line": 42,
  "name": "Verify on tapping on \u0027Sign-in\u0027 tab navigates to \u0027Sign-in\u0027 page",
  "description": "",
  "id": "to-test-whether-google-search-functionality-works-as-expected;verify-on-tapping-on-\u0027sign-in\u0027-tab-navigates-to-\u0027sign-in\u0027-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 43,
  "name": "User must be at \u0027Google homepage\u0027",
  "keyword": "Given "
});
formatter.step({
  "line": 44,
  "name": "User must tap in \u0027Sign-in\u0027 text",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "verify whether user in in \u0027Sign-in\u0027 page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_must_be_at_Google_homepage()"
});
formatter.result({
  "duration": 1332670200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_must_tap_in_Sign_in_text()"
});
formatter.result({
  "duration": 2806525900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.verify_whether_user_in_in_Sign_in_page()"
});
formatter.result({
  "duration": 58581200,
  "status": "passed"
});
formatter.scenario({
  "line": 47,
  "name": "Verify whether other search options works fine",
  "description": "",
  "id": "to-test-whether-google-search-functionality-works-as-expected;verify-whether-other-search-options-works-fine",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 48,
  "name": "User must be in google homepage.",
  "keyword": "Given "
});
formatter.step({
  "line": 49,
  "name": "User must enter any search string",
  "keyword": "When "
});
formatter.step({
  "line": 50,
  "name": "User must press search tab",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "User must tap \u0027Images\u0027 tab",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "User must tap \u0027Shopping\u0027 tab",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "User must tap \u0027News\u0027 tab",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "User must tap \u0027Videos\u0027 tab",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_must_be_in_google_homepage()"
});
formatter.result({
  "duration": 1471595600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_must_enter_any_search_string()"
});
formatter.result({
  "duration": 1211717200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_must_press_search_tab()"
});
formatter.result({
  "duration": 2235056500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_must_tap_Images_tab()"
});
formatter.result({
  "duration": 3613340900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_must_tap_Shopping_tab()"
});
formatter.result({
  "duration": 2267632500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_must_tap_News_tab()"
});
formatter.result({
  "duration": 1692798300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_must_tap_Videos_tab()"
});
formatter.result({
  "duration": 1675135700,
  "status": "passed"
});
});