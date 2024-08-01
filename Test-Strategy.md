# Test Strategy

The test strategy for the phase 1 has been created based by the Syllabus 2018 version 3.1.1:

General objective: 
Ensure the quality and functionality of the product, including the modules: Product Management, E-store and Back-office Management. 
The testing strategy involves 4 test levels: components testing, integration testing, system testing and UAT. Each level has specific scopes, entry and exit criteria to ensure through validation of functionalities and performance. 

**Component Testing**
Objectives:
Reducing risk; Building confidence in the component’s quality; Finding defects in the component; Preventing defects from escaping to higher test levels.
Scope:	Validate individual components of each module in order to verify if there is incorrect functionality and to detect possible defects such as in the code or logical code incorrect.
Product Management Module:	Verify the creation of the new products, the update product stocks and the update of sales campaign.
E-Store (Website):	Guarantee that in the front end is displaying the available products, adding/removing products from the basket and updating of the value of each product, be able to order as a guest.
Back-office Management Module: Verify order cancellations and stock reversion. 
Entry Criteria:	Finish the code implementation for each component and unit test cases are prepared and reviewed. 
Exit Criteria:	All unit tests are executed with 100% pass rate or minor defects and all critical defects are resolved.
Responsibilities: 	In general, the component testing is made by the developers, however the QA testers can participate of those tasks.

**Integration Testing**
Objectives:	Reducing risk; Building confidence in the quality of the interfaces of each module; Finding defects; Preventing defects from escaping to higher test levels.
Scope:	Validate interactions between the components and modules.
Product Management Module and E-Store (Website):	Guarantee that the modifications made in the product management module are displayed correctly in the E-store (front end).
E-Store (Website) and Back-office Management Module:	Confirm that the order placement is updating the stock and the order cancelation reverts the stock correctly.
Payment Process:	Validate the integration with the payment provider. 
Entry Criteria:	Unit test for all components is done with success and integration test cases are prepared. 
Exit Criteria:	All integration tests are executed with 100% pass rate or minor defects and all the critical defects are fixed. 
Responsibilities:	QA tester.

**System Testing**
Objectives:	Reducing risk; Verifying whether the functional and non-functional behaviors of the system are as designed and specified; Validating that the system is complete and will work as expected; Building confidence in the quality of the system as a whole; Finding defects; Preventing defects from escaping to higher test levels or production.
Scope:	Test the system with a focus on the behavior and capabilities in order to ensure it meets the requirements.
End-to-End Workflows:	Validate the complete process from the creation of the new product to order placement and cancelation.
Functional Testing:	Verify that all the functionalities work as expected.
Non-Functional: Testing	Test performance, usability. 
Entry Criteria:	Integration testing is complete and systems test cases are prepared.
Exit Criteria:	All systems tests are executed with 100% pass rate or minor defects and all the critical defects are fixed, as well as the functional and non-functional requirements are consistent.
Responsibilities:	QA tester

**User Acceptance Testing**
Objectives:	Establishing confidence in the quality of the system as a whole; Validating that the system is complete and will work as expected; Verifying that functional and non-functional behaviors of the system are as specified.
Scope:	Validate that the system works as expected and meets the business requirements, as well as is ready for deployment.
Functional Validation:	Validate functionalities from the user perspective and guarantee that the system aligns with the requirements. 
Usability Testing:	Validate the user experience an interface. 
Entry Criteria:	System tests are complete and User Acceptance test cases are prepared.
Exit Criteria:	All UAT tests are executed with user acceptance. 
Responsibilities:	Stakeholders and end-users. The QA tester can conduce the testing.

**The types of testing**
Functional Testing:  Validate each functionality against the requirements.
Regression Testing:	 Ensure new changes not break the existing functionalities;
Integration Testing: Verify interactions between the modules.
User Acceptance Testing (UAT): Confirm the application meets business requirements and is ready for production use. 
Performance Testing: Ensure the application has a good performance as expected load condition (applicable for E-store module).

**Test Approach**
Manual Testing: Initial validation of all functionalities requested for the phase 1;
                Complex scenarios that require human judgment;
                User interface testing to ensure usability;
                User Acceptance Testing.
Automation Testing:	Regression testing to ensure new changes do not break the existing functionalities;
                    Repetitive tests such as adding products, updating stocks and applying sales campaigns.
                    Performance testing to simulate load conditions on the e-store.

That test strategy ensures comprehensive coverage of all functionalities of the project. The combination of different test types and structured approach will help in delivering a high-quality product.  
