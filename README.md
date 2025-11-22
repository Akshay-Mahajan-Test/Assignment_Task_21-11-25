# Assignment_Task_21-11-25

**#Database & API Testing**
For database testing (PSQL), after performing any operation from UI or API like registration, login, or profile update, I verify whether the correct data is actually stored in the DB.

For API testing, I validate backend functionality without depending on the UI. I use Postman for manual checks and REST-Assured for automation. I test both positive and negative scenarios — valid data should return success and save correct values, while invalid payloads, missing fields, duplicate email, expired/invalid token, or large bio/image should return proper error responses with correct HTTP status codes. I always verify the response body, JSON fields, messages, and schema properly.

For end-to-end integration, I make sure UI, API, and DB are in sync. I validate all three layers to ensure complete data consistency and smooth user experience. This confirms that the system is working correctly across the full workflow, not just on one layer.


**#Security, Smoke & Regression Testing**

Smoke Testing:
For smoke testing, I will quickly verify the core flow of the User Registration & Profile feature to confirm it is release-ready. My smoke checks include: user can open the register screen > successfully register with valid data > login > open the My Profile page > update name/bio/avatar > and see the updated details immediately. 

Regression Testing:
For regression, I will focus on all existing areas that might get impacted by changes in registration and profile modules.

Security Testing:
For security, I will make sure no one can bypass authentication and directly call the profile API without a valid token. I will also try XSS payloads in name and bio fields to ensure the app blocks HTML/JavaScript injections.
