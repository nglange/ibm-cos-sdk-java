/* 
* Copyright 2017 IBM Corp. All Rights Reserved. 
* 
* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with 
* the License. You may obtain a copy of the License at 
* 
* http://www.apache.org/licenses/LICENSE-2.0 
* 
* Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on 
* an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the 
* specific language governing permissions and limitations under the License. 
*/ 
package com.ibm.oauth;

import com.ibm.oauth.Token;

/**
 * Interface to expose the method required for a class to implement a Token Provider.
 * The Token Manager will expect a Token object response.
 */
public interface TokenProvider {

	/**
	 * Retrieve a Token representation of the json object
	 * returned from the IAM Service synchronously
	 * 
	 * 
	 * @return {@link Token}
	 * 			The IAM Token
	 */
	public Token retrieveToken();

}
