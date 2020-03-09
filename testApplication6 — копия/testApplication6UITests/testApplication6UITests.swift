//
//  testApplication6UITests.swift
//  testApplication6UITests
//
//  Created by Viktoria on 09.03.2020.
//  Copyright © 2020 Viktoria. All rights reserved.
//

import XCTest

class testApplication6UITests: XCTestCase {

    override func setUp() {
        continueAfterFailure = false
    }

    override func tearDown() {
    }

    func testExample() {
        // UI tests must launch the application that they test.
        let app = XCUIApplication()
        app.launch()
        
        //Проверяем наличие кнопки
        assertButton(app)
        //Проверяем наличие обоих текстовых полей
        assertTestFields(app)
        //Проверяем кликабельность кнопки
        pushButton(app)
        //Проверяем, что нажатие было осуществленно и правильные значения отображены в текстовых полях - НЕ РАБОТАЕТ ПРОВЕРКА ПОЛЕЙ
        pushButtonAssertValueFields(app)
    }
    
    private func assertButton(_ app: XCUIApplication) {
        let singleButton = app.buttons["button_1"]
        waitForElementToAppear(element: singleButton)
//        singleButton.tap()
    }
    
    private func assertTestFields(_ app: XCUIApplication) {
        let test1TextField = app.textFields["test1Field"]
        waitForElementToAppear(element: test1TextField)
//        test1TextField.tap()
        let test2TextField = app.textFields["test2Field"]
        waitForElementToAppear(element: test2TextField)
//        test2TextField.tap()
    }
    
    private func pushButton(_ app: XCUIApplication) {
        let singleButton = app.buttons["button_1"]
        waitForElementToAppear(element: singleButton)
        singleButton.tap()
    }
    
    private func pushButtonAssertValueFields(_ app: XCUIApplication) {
        let singleButton = app.buttons["button_1"]
        waitForElementToAppear(element: singleButton)
        singleButton.tap()
        sleep(2)
        
    }
    
    private func waitForElementToAppear(element: XCUIElement, timeout: TimeInterval = 30) {
        let existsPredicate = NSPredicate(format: "exists == true")
        expectation(for: existsPredicate, evaluatedWith: element, handler: nil)
        waitForExpectations(timeout: timeout) { error in
            guard error != nil else { return }
            let message = "Failed to find \(element) after \(timeout) seconds."
            self.recordFailure(withDescription: message, inFile: #file, atLine: #line, expected: true)
        }
    }

//    func testLaunchPerformance() {
//        if #available(macOS 10.15, iOS 13.0, tvOS 13.0, *) {
//            // This measures how long it takes to launch your application.
//            measure(metrics: [XCTOSSignpostMetric.applicationLaunch]) {
//                XCUIApplication().launch()
//            }
//        }
//    }
}
