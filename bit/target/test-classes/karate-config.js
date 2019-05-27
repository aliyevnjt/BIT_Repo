function fn() {   
  var env = karate.env; // get java system property 'karate.env'
  
  var config = { // base config JSON
    urlBase: 'http://localhost:3000/',
    urlDB: ''
  };
  
  
  if (env == 'qa') {
    // over-ride only those that need to be
    config.urlBase = 'http://localhost:3000/';
    config.urlDB = '';
  } 
  else if (env == 'dev') {
    config.urlBase = 'http://localhost:3000';
    config.urlDB = '';
  }
  
  // don't waste time waiting for a connection or if servers don't respond within 5 seconds
  karate.configure('connectTimeout', 15000);
  karate.configure('readTimeout', 15000);
  return config;

}