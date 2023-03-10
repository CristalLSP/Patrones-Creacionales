package abstractfactory

import ProductServiceRestImpl

class RestServiceImpl: IServiceStackAbstractFactory {
    override fun getProductsService(): IProductService = ProductServiceRestImpl()

    override fun getEmployeeService(): IEmployeeService= EmployeeServiceRestImpl()
}