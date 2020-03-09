//
//  ViewController.swift
//  testApplication6
//
//  Created by Viktoria on 09.03.2020.
//  Copyright © 2020 Viktoria. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    
    @IBOutlet weak var textField_1: UITextField!
    @IBOutlet weak var textField_2: UITextField!
    
    @IBOutlet weak var button_1: UIButton!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }

    @IBAction func pushButton(_ sender: UIButton) {
        textField_1.text = "Тест 1"
        textField_2.text = "Тест 2"
    }
    

}

