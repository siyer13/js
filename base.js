var profiles = require('./profiles');

profiles = JSON.stringify(profiles).replace(/name/g, 'fullname');
profiles = JSON.parse(profiles);
console.log(profiles.sridhar);
