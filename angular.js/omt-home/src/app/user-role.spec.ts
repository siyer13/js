import { UserRole } from './user-role';

describe('UserRole', () => {
  it('should create an instance', () => {
    expect(new UserRole('a16009',true, true)).toBeTruthy();
  });
});
