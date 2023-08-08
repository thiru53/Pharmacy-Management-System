# Pharmacy-Management-System
# Project Description
The Pharmacy Management System with Integrated Sales and Inventory Tracking is a software solution designed to make running a pharmacy smoother. It helps manage sales and inventory efficiently, saving time and improving business operations. The main goal of this project is to develop an API, which is like a set of rules and tools, that includes important features such as smart calculations, checking data accuracy, handling errors, and organizing data effectively in a database. By creating this API, the system will be able to handle various tasks effectively and help pharmacies run more efficiently.

# Task 1: Product Management: Adding and Displaying Inventory Items
Perform the following tasks before API development:

Download the MySQL database by clicking on the provided link. Pharmacy.sql
Access your database information by clicking on the "Database Info" tab.
Set up the downloaded database in the provided database environment and code.
For this task, your goal is to implement functionalities that allow the addition and view of products in the inventory management system. To accomplish this, the system should provide API endpoints to efficiently perform these operations.

Product Addition ("/product/add" - POST Endpoint): Your task is to develop a POST API endpoint, "/product/add" which enables the addition of a new product to the inventory.

The endpoint should accept the following input in JSON format from Postman:      
    
    {         
        "name": "Product 1",         
        "price": 14.99      
    }

Upon receiving the request, the system should validate the input data. If the product name already exists in the "product" table, an appropriate error message should be returned,otherwise store the data of product in the 'product' table . Initially, the product's quantity will be set to zero and createdAt and updatedAt date is set to current date.

Once the product is successfully added, the API should respond with a JSON response:

    {    
        "message": "Product added successfully",    
        "status": "success" 
    }

View Products ("/product" and "/product/{id}" - GET Endpoints): To retrieve product information, you need to implement two GET API endpoints.

The first endpoint, "/product," should return a list of all available products in the inventory.

The JSON response for the above endpoint should be as follows:

    [    
        {       
            "id": 1,       
            "name": "Product 1",       
            "qty": 0,       
            "price": 14.99,       
            "createdAt": "2023-07-12",       
            "updatedAt": "2023-07-12"   
        }
    ]

The second endpoint, "/product/{id}" should retrieve the details of a specific product based on its unique identifier.

The JSON response for the above endpoint should be as follows:

    {    
        "id": 1,    
        "name": "Product 1",    
        "qty": 0,    
        "price": 14.99,    
        "createdAt": "2023-07-12",    
        "updatedAt": "2023-07-12" 
    }

These functionalities should include proper error handling, data validation, and should utilize the predefined database schema.

By successfully implementing the above tasks, the inventory management system will enable seamless management of product additions and retrieval of product information.

# Task 2: Batch Management: Adding and Displaying Batches for Products
In this task, your objective is to implement functionalities for adding and displaying batches related to products in the inventory management system. The system should provide API endpoints to efficiently perform these operations.

Batch Addition ("/product/batch/add/{product_id}" - POST Endpoint):

Your task is to develop a POST API endpoint, "/product/batch/add/{product_id}" which allows the addition of a batch for a specific product in the inventory.

The endpoint should accept the following input in JSON format from Postman:

    {    
        "qty": 12,    
        "expiryDate": "2023-07-12" 
    }

Upon receiving the request, the system should validate the input data and consider the following validation scenarios:

"Product with the given ID does not exist." "The batch you are trying to add is expired." "Batch with the same expiry date already exists for the product."

If any of the above scenarios occur, the API should respond with an appropriate error message.

On successful addition of the batch, the system should update the quantity of the product by summing the quantity of all its batches.

The API should respond with a JSON response:

    {    
        "message": "Batch added successfully.",    
        "status": "success" 
    }

By incorporating the quantity update logic, the inventory management system ensures accurate tracking of the product's quantity with the addition of each batch.

View Batches ("/product/batch/{product_id}" and "/product/batchById/{batch_id}" - GET Endpoints): To retrieve batch information, implement two GET API endpoints.

The first endpoint, "/product/batch/{product_id}" should return a list of all batches for a specific product based on its unique identifier.

The JSON response for the above endpoint should display all batches with different expiry dates for the product.

    [     
        {         
            "batchId": 1,         
            "productId": 1,         
            "qty": 12,         
            "expiryDate": "2023-07-12",         
            "createdAt": "2023-07-12",         
            "updatedAt": "2023-07-12"     
        } 
    ]

The second endpoint, "/batch/{batch_id}" should retrieve the details of a specific batch based on its unique identifier.

The JSON response for the above endpoint should display the details of the requested batch.

    {         
        "batchId": 1,         
        "productId": 1,         
        "qty": 12,         
        "expiryDate": "2023-07-12",         
        "createdAt": "2023-07-12",         
        "updatedAt": "2023-07-12"  
    }

View All Batches ("/product/batch" - GET Endpoint): To display all batches available in the inventory, implement a GET API endpoint, "/product/batch"

The JSON response for the above endpoint should show all batches from the batch table.

    [     
        {         
            "batchId": 1,         
            "productId": 1,         
            "qty": 12,         
            "expiryDate": "2023-07-12",         
            "createdAt": "2023-07-12",         
            "updatedAt": "2023-07-12"     
        },      
        {         
            "batchId": 2,         
            "productId": 2,         
            "qty": 16,         
            "expiryDate": "2023-07-25",         
            "createdAt": "2023-07-12",         
            "updatedAt": "2023-07-12"     
        } 
    ]

These functionalities should include proper error handling and data validation to handle scenarios such as non-existent products, expired batches, and duplicate expiry dates for the product.

By successfully implementing the above tasks, the inventory management system will allow seamless management of batch additions and the retrieval of batch information for products.


# Task 3: Batch Update and Deletion
For this task, you will implement functionality to update the quantity and expiry date of a specific batch in the inventory management system. The system should provide an API endpoint to efficiently perform this operation.

Batch Update ("/product/batch/update/{batch_id}" - POST Endpoint): Your task is to develop a POST API endpoint,  which allows updating the quantity and expiry date of a specific batch.

The endpoint should accept the following input in JSON format from Postman:

    {    
        "qty": 12,    
        "expiryDate": "2023-07-25" 
    }

Upon receiving the request, the system should validate the input data and consider the following validation scenarios:

"Batch with the given ID does not exist." "The specified expiry date already exists for the product." "No update required. Quantity and expiry date are the same." If any of the above scenarios occur, the API should respond with an appropriate error message.

On successful update of the batch, the system should update the quantity of the product if the quantity is changed.

The API should respond with a JSON response:

    { 
        "message": "Batch updated successfully.", 
        "status": "success" 
    }

By updating the quantity and expiry date of the batch, the inventory management system ensures accurate and up-to-date information for each batch.

Batch Deletion ("/product/batch/delete/{batch_id}" - POST Endpoint): Your task is to develop a POST API endpoint,  which allows the deletion of a specific batch using its unique identifier.

Upon receiving the request, the system should check if the batch with the given ID exists. If not, the API should respond with an appropriate error message: "Batch with the given ID does not exist."

On successful deletion of the batch, the system should reduce the quantity of the product by the quantity of the deleted batch.

The API should respond with a JSON response:

    {    
        "message": "Batch deleted successfully.",    
        "status": "success" 
    }

By deleting the batch and updating the product quantity accordingly, the inventory management system ensures accurate tracking of batch information and reflects the updated product quantity after deletion.

# Task 4: Product Update and Deletion
In this task, you will implement functionalities to update and delete products in the inventory management system. The system should provide API endpoints to efficiently perform these operations.

Product Update ("/product/update/{product_id}" - POST Endpoint): Your task is to develop a PUT API endpoint, "/product/update/{product_id}"which allows updating the name and price of a specific product.

The endpoint should accept the following input in JSON format from Postman:

    {    
        "name": "Product 1",    
        "price": 15.99 
    }

Upon receiving the request, the system should validate the input data and consider the following validation scenarios:

"Invalid product ID." "Product name already exists with a different product ID." If any of the above scenarios occur, the API should respond with an appropriate error message.

On successful validation and update of the product, the API should respond with a JSON response:

    {    
        "message": "Product updated successfully",    
        "status": "success" 
    }

By updating the name and price of the product, the inventory management system ensures accurate and up-to-date product information.

Product Deletion ("/product/delete/{product_id}" - POST Endpoint): Your task is to develop a POST API endpoint, "/product/delete/{product_id}" which allows the deletion of a specific product and its associated batches.

The endpoint should use the product ID to identify the product and delete it from the product table, along with all its associated batches from the batch table.

Upon receiving the request, the system should check if the product with the given ID exists. If not, the API should respond with an appropriate error message: "Invalid product ID."

On successful deletion of the product and its batches, the API should respond with a JSON response:

    {    
        "message": "Product deleted successfully",    
        "status": "success" 
    }



By deleting the product and its associated batches, the inventory management system ensures the removal of the product from the system and maintains data integrity.

By successfully implementing the above tasks, the inventory management system will allow seamless updating and deletion of products, ensuring accurate and up-to-date product information in the system.


# Task 5: Stock Viewing: Total Stock and Product-specific Stock
In this task, you will implement functionalities to view the stock or quantity of products in the inventory management system. The system should provide API endpoints to efficiently retrieve this information.

View Total Stock ("/product/stock" - GET Endpoint): Your task is to develop a GET API endpoint, which allows viewing the details of all product stocks in the product table.

The API endpoint should provide the following JSON response:

    [    
        {        
            "productName": "Product 1",        
            "productId": 1,        
            "totalQuantity": 12,        
            "batches": [                             
                            {                                
                                "expiryDate": "2023-07-25",                                
                                "quantity": 12,                                
                                "batchId": 1                             
                            }         
                        ],                        
            "alertMessage": "Enough stock"  
        } 
    ]

View Product-specific Stock ("/product/stock/{product_id}" - GET Endpoint): Your task is to develop a GET API endpoint, "/product/stock/{product_id}" which allows viewing the details of the stock for a specific product based on its unique identifier.

Upon receiving the request, the system should check if the product with the given ID exists. If not, the API should respond with an appropriate error message: "Product with the given ID does not exist."

The API should provide the following JSON response:

    {
        "productName": "Product 1",
        "productId": 1,
        "totalQuantity": 12,
        "batches": [
                {
                    "expiryDate": "2023-07-25",
                    "quantity": 12,
                    "batchId": 1
                }
        ],
        "alertMessage": "Enough stock"
        }
In the JSON response, the "alertMessage" field should display "Enough stock" if the total quantity of the product is 10 or more. Otherwise, it should display "Add stock."

By implementing these functionalities, the inventory management system allows users to easily view the total stock of all products or the stock of a specific product, including information about individual batches and appropriate alerts about stock levels.

# Task 6: Order Processing and Sales Management
In this task, you will implement functionalities related to processing orders and managing sales in the inventory management system. The system will provide API endpoints to process orders, view all sales, and view sale items for a specific sale.

Order Processing ("/processOrder" - POST Endpoint): To process orders for multiple products, create a POST API endpoint, "/processOrder." This endpoint will accept order data and validate it for completeness and accuracy.

The endpoint should accept the following input in JSON format from Postman:

    {    
        "saleItems": [
            {                                
                "productId": 1,                                
                "quantity": 2                             
            },                             
            {                               
                "productId": 2,                               
                "quantity": 1                             
            }                       
        ] 
    }

Upon receiving the request, the system should validate the order data and consider the following validation scenarios:

"Product not found for ID: " + productId "Invalid order data" "Invalid sale item data" "Insufficient stock available for one or more products" If any of the above scenarios occur, the API should respond with an appropriate error message.

On successful validation, the system should process the order by checking the available stock for each product. The system should sell the quantity required from the nearest expiry date batch. If the quantity required is greater than the nearest expiry date batch, the system should sell the remaining quantity from another nearer expiry date batch.

Upon successful processing of the order, the system should store the sale details in the "sales" table. The "sales" table should include the total amount of the sale and the sale date. The sale items, along with their quantities, unit prices, and total amounts, should be stored in the "saleItems" table, linked to the respective sale ID.

View All Sales ("/Sales" - GET Endpoint): To retrieve information about all sales, implement a GET API endpoint, "/Sales." This endpoint should return a list of all sales in the system. Each sale entry should include details such as the sale ID, total amount, sale date, and createdAt date.

The API should respond with the following JSON response format:

    {    
        [        
            {              
                "saleId": 1,              
                "saleDate": "2023-07-12 T02:58:35.838+00:00",              
                "totalAmount": 44.97,              
                "createdAt": "2023-07-12 T02:58:35.838+00:00"       
            }   
        ] 
    }

View Sale Items ("Sales/{saleID}/items" - GET Endpoint): To view the sale items associated with a specific sale, create a GET API endpoint, "Sales/{saleID}/items" Replace {saleID} with the unique identifier of the desired sale. If no sale items are found for the given sale ID, an appropriate message should be returned. The response from this endpoint should include details of the sale items, such as the sale item ID, sale ID, product ID, quantity, unit price, subtotal, and createdAt date.

The API should respond with the following JSON response format:

    {     
        "data": [                     
            {                         
                "saleItemId": 1,                          
                "saleId": 1,                         
                "productId": 1,                         
                "quantity": 2,                         
                "unitPrice": 14.99,                         
                "subtotal": 29.98,                         
                "createdAt": "2023-07-08T04:35:56.135+00:00"                    
            },                   
            {                       
                "saleItemId": 2,                       
                "saleId": 1,                       
                "productId": 2,                       
                "quantity": 1,                       
                "unitPrice": 14.99,                       
                "subtotal": 14.99,                       
                "createdAt": "2023-07-08T04:35:56.135+00:00"                  
            }            
        ],           
        "status": "success"   
    }

These functionalities should incorporate proper error handling, data validation, and utilize the predefined database schema.

By successfully implementing the above tasks, the inventory management system will enable the processing of orders, storage of sales data, and retrieval of sales and sale item information, providing a comprehensive view of the system's sales activities.







