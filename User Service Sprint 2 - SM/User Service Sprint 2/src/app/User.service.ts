import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  API = "http://localhost:8082";  // Base API URL

  constructor(private http: HttpClient) {}

  /**
   * Registers a new User.
   * @param UserData - The User data to register.
   */
  public registerUser(UserData: any) {
    return this.http.post(`${this.API}/userservice`, UserData);
  }

  /**
   * Fetches all Users from the backend.
   */
  public getUsers() {
    return this.http.get(`${this.API}/userservice`);  // Ensure this matches your backend
  }

  /**
   * Deletes a User by ID.
   * @param UserId - The ID of the User to delete.
   */
  public deleteUser(UserId: number) {
    return this.http.delete(`${this.API}/userservice/${UserId}`);
  }

  /**
   * Updates a User's details.
   * @param User - The updated User data.
   */
  public updateUser(User: any) {
    if (!User.id) {
      throw new Error('User ID is required to update user data.');
    }
    return this.http.put(`${this.API}/userservice
      /${User.id}`, User);  // Use the correct ID for updating
  }
}
