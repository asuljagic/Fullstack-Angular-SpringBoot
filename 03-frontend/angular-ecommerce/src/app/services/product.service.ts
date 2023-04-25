import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from '../common/product';
import { map } from 'rxjs/operators';
@Injectable({
  providedIn: 'root'
})
export class ProductService {

private baseUrl = 'http://localhost:8080/api/products';

  constructor(private httpClient: HttpClient ) { }

  // This method returns an Observable<Product[]> from the Spring Data REST API
  getProductList(theCategoryId: number): Observable<Product[]> {
    const searchUrl = `${this.baseUrl}/search/findByCategoryId?id=${theCategoryId}`;

    return this.httpClient.get<GetResponse>(searchUrl).pipe(
      map(response => response._embedded.products) 
    );
  }
}

// This is a temporary interface to help unwrap the JSON response from Spring Data REST
interface GetResponse {
  _embedded: {
    products: Product[];
  }
}
